import { Component } from '@angular/core';
import { CustomerService } from '../../services/customer.service';
import { MatSnackBar } from '@angular/material/snack-bar';
import { FormBuilder } from '@angular/forms';
import { MatDialog } from '@angular/material/dialog';
import { UserStorageService } from 'src/app/services/storage/user-storage.service';
import { PlaceOrderComponent } from '../place-order/place-order.component';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.scss']
})
export class CartComponent {

  cartItems: any[] = [];
  order:any;

  constructor(
    private customerService: CustomerService,
    private snackBar: MatSnackBar,
    private fb: FormBuilder,
    public dialog:MatDialog,
  ){}

  ngOnInit():void{
    this.getCart();
  }

  getCart(){
    this.cartItems = [];
    this.customerService.getCartByUserId().subscribe(res =>{
      this.order = res;
      res.cartItems.forEach(element =>{
        element.processedImg = `data:image/jpeg;base64,` + element.returnedImg;
        this.cartItems.push(element);
      });
    })
  }

  increaseProductQuantity(productId:any){
    this.customerService.increaseProductQuantity(productId).subscribe(res=>{
      this.snackBar.open('Product quantity icreased', 'Close', {duration:5000});
      this.getCart();
    })
  }

  decreaseProductQuantity(productId:any){
    this.customerService.decreaseProductQuantity(productId).subscribe(res=>{
      this.snackBar.open('Product quantity decreased', 'Close', {duration:5000});
      this.getCart();
    })
  }

  placeOrder(){
    this.dialog.open(PlaceOrderComponent);
  }

}

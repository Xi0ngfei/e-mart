import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { ReactiveFormsModule } from '@angular/forms';


import { ProductListComponent } from './item-list/item-list.component';
import { CartComponent } from './cart/cart.component';

import { HttpClientModule } from '@angular/common/http';
import { ProductDetailsComponent } from './item-detail/item-detail.component';
import { ShippingComponent } from './shipping/shipping.component';
import { LoginComponent } from './user-login/user-login.component';
import {  FormsModule  } from '@angular/forms';
import { AddItemComponent } from './seller-management/add-item.component';

@NgModule({
  declarations: [
    AppComponent,
    ProductListComponent,
    ProductDetailsComponent,
    CartComponent,
    ShippingComponent,
    LoginComponent,
    AddItemComponent
  ],
  imports: [
    BrowserModule,
	  HttpClientModule,
    ReactiveFormsModule,
    FormsModule,
	  RouterModule.forRoot([
      {path:'',component:LoginComponent}, 
      {path:'login',component:LoginComponent}, 
      {path:'product',component:ProductListComponent}, 
      {path:'products/:productId',component:ProductDetailsComponent}, 
      {path:'cart',component:CartComponent},
      {path:'ship',component:ShippingComponent}, 
      {path:'additem',component:AddItemComponent}
	 ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

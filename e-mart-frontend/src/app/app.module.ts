import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { ReactiveFormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { TopBarComponent } from './top-bar/top-bar.component';
import { ProductListComponent } from './product-list/product-list.component';
import { HttpClientModule } from '@angular/common/http';
import { ProductDetailsComponent } from './product-details/product-details.component';
import { CartComponent } from './cart/cart.component';
import { ShippingComponent } from './shipping/shipping.component';
import { ProductAlertsComponent } from './product-alerts/product-alerts.component';
import { SigninComponent } from './signin/signin.component';
import {  FormsModule  }  from  '@angular/forms';
import { AddItemComponent } from './seller/add-item/add-item.component';

@NgModule({
   imports: [
	 BrowserModule,
	 HttpClientModule,
    ReactiveFormsModule,
    FormsModule,
	 RouterModule.forRoot([
     {path:'',component:SigninComponent},
     {path:'product',component:SigninComponent},
	 	 {path:'products/:productId',component:ProductDetailsComponent},
	   {path:'cart',component:CartComponent},
     {path:'shipping',component:ShippingComponent},
     {path:'sign-in',component:SigninComponent},
     {path:'add-item',component:AddItemComponent}
	 ])
	],
   declarations: [
      AppComponent,
      TopBarComponent,
      ProductListComponent,
      ProductAlertsComponent,
      ProductDetailsComponent,
      CartComponent,
      ShippingComponent,
      SigninComponent,
      AddItemComponent
   ],
   bootstrap: [
      AppComponent
   ]
})
export class AppModule { }
import { Component } from '@angular/core';

import { products } from '../resource/products';

@Component({
  selector: 'app-item-list',
  templateUrl: './item-list.component.html',
  styleUrls: ['./item-list.component.css']
})
export class ProductListComponent {
  products = products;

  share() {
    window.alert('The item is shared!');
  }
  onNotify() {
    window.alert('We will send you a message when the item is shipping');
  }
}
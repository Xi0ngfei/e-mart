import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {UserService} from '../user.service';

@Component({
  selector: 'app-top-bar',
  templateUrl: './top-bar.component.html',
  styleUrls: ['./top-bar.component.css']
})
export class TopBarComponent implements OnInit {

 
  constructor(private userService: UserService, private router: Router) {
   }

  ngOnInit() {
  }

  adminUser=false;
  validateUser(user){
    if (user.name === "Flora") {
       this.adminUser=true;
    }
  }
}
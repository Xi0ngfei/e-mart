import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {UserService} from '../user.service';



interface Alert {
  type: string;
  message: string;
}
const ALERTS: Alert[] = [];

@Component({
  selector: 'app-signin',
  templateUrl: './signin.component.html',
  styleUrls: ['./signin.component.css']
})
export class SigninComponent implements OnInit {

  alerts: Alert[];

  constructor(private userService: UserService, private router: Router) {
    this.reset();
  }

 /*  constructor() { } */

  /* ngOnInit() {
  } */

  ngOnInit(): void {
    if (sessionStorage.getItem('token')) {
      this.router.navigate(['/products']);
    }
  }



  adminUser=false;
   onSubmit(value:any){
     if(this.validInput(value)){
      console.log(JSON.stringify(value));
      window.alert("You've logged in!");
      if(value.name==="Flora"){
      this.adminUser=true;}
     }
  } 
 /*   onSubmit(value: any) {
    if (this.validInput(value)) {
      this.userService.postSignIn(value).subscribe(
        data => {
          console.log(JSON.stringify(data));
          window.alert("You've logged in!"); */
 /*          const info: any = data;
          if (200 === info.code) {
              console.log('登录成功，调转详情页');
              sessionStorage.setItem('token', info.result.token)
              this.router.navigate(['/products']);
          } else {
            console.log('登录失败，弹出MSG');
            this.alerts.push({type : 'danger', message: 'username or password error!'});

          } 
        }
      );
    }
  } */

  validInput(value: any): boolean {
    this.reset();
    let result = true
    if (!value.name) {
      this.alerts.push({type : 'danger', message: 'username required!'});
      result = false;
    }

    if (!value.password) {
      this.alerts.push({type : 'danger', message: 'password required!'});
      result =  false;
    }

    if (value.password.length < 6) {
      this.alerts.push({type : 'danger', message: 'password length must be greater than 6!'});
      result =  false;
    }
    return result;
  }

  close(alert: Alert) {
    this.alerts.splice(this.alerts.indexOf(alert), 1);
  }

  reset() {
    this.alerts = Array.from(ALERTS);
  }

}

import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Customer } from '../customer';

@Component({
  selector: 'app-customer-home',
  templateUrl: './customer-home.component.html',
  styleUrls: ['./customer-home.component.css']
})
export class CustomerHomeComponent implements OnInit {

  customerEmail = localStorage.getItem('customerEmail');
  constructor(private routerObj:Router) { 
    console.log(localStorage.getItem('customerEmail'));
    if(localStorage.getItem('customerEmail') == null) {
      this.routerObj.navigate(['customer/login']);
    }
  }
  urlToGo:any;
  ngOnInit(): void {
    
  }
  viewProfile(){
    this.routerObj.navigate(['customer/profile']);
  }
  logoutCustomer() {
    localStorage.removeItem('customerEmail');
    this.routerObj.navigate(['customer/login']);
  }
}

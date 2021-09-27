import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Customer } from '../customer';
import { CustomerLoginComponent } from '../customer-login/customer-login.component';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  
  customer = new Customer()
  customerEmail = localStorage.getItem('customerEmail');
  customerName = localStorage.getItem('customerName');
  customerAddress = localStorage.getItem('customerAddress'); 
  constructor(private customerService:CustomerService, private routerObj:Router) { }

  ngOnInit(): void {
  }

  getProfile() {
    
  //  this.customerService.getCurrentCustomer().subscribe(
  //   data=>this.customer
  //  );
  //  console.log(this.customer.customer_email);
  
  }
  goToHome() {
    this.routerObj.navigate(['customer/home']);
  }

}

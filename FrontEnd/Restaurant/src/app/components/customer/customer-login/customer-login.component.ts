import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';
import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-customer-login',
  templateUrl: './customer-login.component.html',
  styleUrls: ['./customer-login.component.css']
})
export class CustomerLoginComponent implements OnInit {



  loginForm: FormGroup | undefined;
   



  customer = new Customer();
  errorMessage:string='';
  constructor(private customerService:CustomerService, private routerObj:Router,private fb: FormBuilder) { 
    this.myForm();
  }

  myForm() {
      this.loginForm = this.fb.group({
      customer_email : ['', [Validators.required, 
         Validators.pattern("^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$")] ]
      });
   }

  ngOnInit(): void {
    
  }
  loginCustomer() {
    this.customerService.loginCustomerFromRest(this.customer).subscribe(
      data=>{
        console.log("User Logged in successfully");
        this.routerObj.navigate(['customer/home']);
        this.customer = data;
      },
      error=>{
        this.errorMessage = 'Bad Credentials. Please enter the correct one!!!'
        console.log(error);
      }
    )
    
      localStorage.setItem('customerEmail',this.customer.customer_email);
      // localStorage.setItem('customerName',this.customer.customer_name);
      // localStorage.setItem('customerAddress',this.customer.customer_address);
      console.log(localStorage.getItem('customerEmail'));
      return this.customer;
  }

}

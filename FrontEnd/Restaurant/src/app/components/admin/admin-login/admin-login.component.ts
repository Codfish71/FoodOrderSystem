import { Component, OnInit } from '@angular/core';
import { FormBuilder, NgForm, Validators } from '@angular/forms';
import { Route, Router } from '@angular/router';
import { Admin } from '../admin';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit {
  admin = new Admin();
  erroMessage = '';
  ted:boolean=false;
  
  constructor(private adminService:AdminService,private routerObj:Router) { }
  
  ngOnInit(): void {
  }

  loginAdmin(){
     
    this.adminService.loginAdminFromRest(this.admin).subscribe(
      data=>{
        console.log("User successfully logged IN")
        this.routerObj.navigate(['admin/home'])
      },
      error => {
        console.log("Exception occured")
        this.erroMessage = "Bad credentails, Please Enter the correct ones"
      }
      )
      localStorage.setItem('adminEmail',this.admin.admin_email);
      localStorage.setItem('adminName',this.admin.admin_name);
  }

}

import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './components/about/about.component';
import { AdminHomeComponent } from './components/admin/admin-home/admin-home.component';
import { AdminLoginComponent } from './components/admin/admin-login/admin-login.component';
import { AdminRegisterComponent } from './components/admin/admin-register/admin-register.component';
import { ContactComponent } from './components/contact/contact.component';
import { CustomerHomeComponent } from './components/customer/customer-home/customer-home.component';
import { CustomerLoginComponent } from './components/customer/customer-login/customer-login.component';
import { CustomerRegisterComponent } from './components/customer/customer-register/customer-register.component';
import { ProfileComponent } from './components/customer/profile/profile.component';
import { HomePageComponent } from './components/home-page/home-page.component';
import { MenuItemsComponent } from './components/menu/menu-items/menu-items.component';

const routes: Routes = [
  
  {path:'home/',component:HomePageComponent},
  {path:'admin/login',component:AdminLoginComponent},
  {path:'admin/register',component:AdminRegisterComponent},
  {path:'admin/home',component:AdminHomeComponent},
  {path:'customer/login',component:CustomerLoginComponent},
  {path:'customer/home',component:CustomerHomeComponent},
  {path:'customer/register',component:CustomerRegisterComponent},
  {path:'menus/',component:MenuItemsComponent},
  {path:'contacts',component:ContactComponent},
  {path:'about',component:AboutComponent},
  {path:'customer/profile',component:ProfileComponent},
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminLoginComponent } from './components/admin/admin-login/admin-login.component';
import { HomePageComponent } from './components/home-page/home-page.component';
import { AdminRegisterComponent } from './components/admin/admin-register/admin-register.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { FormBuilder, FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AdminHomeComponent } from './components/admin/admin-home/admin-home.component';
import { MenuItemsComponent } from './components/menu/menu-items/menu-items.component';
import { FoodItemsComponent } from './components/food/food-items/food-items.component';
import { FooterComponent } from './components/footer/footer.component';
import { AdminMenuComponent } from './components/admin/admin-menu/admin-menu.component';
import { AdminService } from './components/admin/admin.service';
import { AdminFoodComponent } from './components/admin/admin-food/admin-food.component';
import { CustomerLoginComponent } from './components/customer/customer-login/customer-login.component';
import { CustomerRegisterComponent } from './components/customer/customer-register/customer-register.component';
import { CustomerHomeComponent } from './components/customer/customer-home/customer-home.component';
import { RouterModule } from '@angular/router';
import { ContactComponent } from './components/contact/contact.component';
import { AboutComponent } from './components/about/about.component';
import { ProfileComponent } from './components/customer/profile/profile.component';

@NgModule({
  declarations: [
    AppComponent,
    AdminLoginComponent,
    HomePageComponent,
    AdminRegisterComponent,
    NavbarComponent,
    AdminHomeComponent,
    MenuItemsComponent,
    FoodItemsComponent,
    FooterComponent,
    AdminMenuComponent,
    AdminFoodComponent,
    CustomerLoginComponent,
    CustomerRegisterComponent,
    CustomerHomeComponent,
    ContactComponent,
    AboutComponent,
    ProfileComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    RouterModule,
    ReactiveFormsModule
  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

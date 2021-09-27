import { ComponentFixture, TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { AdminFoodComponent } from './admin-food.component';

import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { AdminService } from '../admin.service';
import { Router } from '@angular/router';
import { FoodService } from './food.service';

describe('AdminFoodComponent', () => {
  
    let adminFoodService:FoodService;
    let routerObj:Router;
  let component: AdminFoodComponent;
  let fixture: ComponentFixture<AdminFoodComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminFoodComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminFoodComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should get all food items', ()=>{
    let  component = new AdminFoodComponent(adminFoodService, routerObj);
    let foodItems = component.getFoodItems();
    const lengthOfList = foodItems.length;
    expect(length).toBeGreaterThan(1);
  })

});

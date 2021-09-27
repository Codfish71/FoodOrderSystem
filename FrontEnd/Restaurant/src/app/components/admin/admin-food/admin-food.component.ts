import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Food } from './food';
import { FoodService } from './food.service';

@Component({
  selector: 'app-admin-food',
  templateUrl: './admin-food.component.html',
  styleUrls: ['./admin-food.component.css']
})
export class AdminFoodComponent implements OnInit {
  foodItems:Array<Food>=[];
  food = new Food();
  deleteMessage:string='';
  constructor(private adminFoodService:FoodService,private routerObj:Router) { }

  ngOnInit(): void {
    this.adminFoodService.getFoodItems().subscribe(
      (response: any) => this.handleSuccessfulResponse(response)

    );
    
  }
  handleSuccessfulResponse(response: any) { 
    this.foodItems = response;
    console.log(this.foodItems)
  }

  deleteFoodItem(id:number){
    this.adminFoodService.deleteFoodItem(id).subscribe(
      data=>{
        console.log(data)
        this.deleteMessage = "deleted successfully";
      },
      error => console.log(error)  
    );
    this.routerObj.navigate(['admin/home']);
  }
  addFoodItem(){
    this.adminFoodService.addFoodItem(this.food).subscribe(
      data=>{
        console.log(data)
      },
      error=>{
        console.log(error);
      }
      
    
    );
    this.routerObj.navigate(['admin/home']);
  }

  getFoodItems() {
    return this.foodItems;
  }
}



import { Component, OnInit } from '@angular/core';
import { Menu } from '../admin-menu/menu';
import { MenuService } from './menu.service';
import { FoodService } from '../admin-food/food.service';
import { Food } from '../admin-food/food';
@Component({
  selector: 'app-admin-menu',
  templateUrl: './admin-menu.component.html',
  styleUrls: ['./admin-menu.component.css']
})
export class AdminMenuComponent implements OnInit {

  

  menus:Array<Menu> = [];
   foodItems:Food[]=[];
  constructor(private menuService:MenuService,private foodService:FoodService) { }

  ngOnInit(): void {

    this.menuService.getMenus().subscribe(
      (response: any) => this.handleSuccessfulResponse(response)

    );

    this.foodService.getFoodItems().subscribe(
      data=>this.foodItems
    );
    
  }
  handleSuccessfulResponse(response: any) { 
    this.menus = response;
    console.log(this.menus)
  }

 
  

  
}

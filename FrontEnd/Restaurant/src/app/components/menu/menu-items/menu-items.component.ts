import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

import { Menu } from '../menu';
import { MenuService } from '../menu.service';

@Component({
  selector: 'app-menu-items',
  templateUrl: './menu-items.component.html',
  styleUrls: ['./menu-items.component.css']
})
export class MenuItemsComponent implements OnInit {
 
  menus:Array<Menu> = [];
  constructor(private menuService:MenuService) { }

  ngOnInit(): void {

    this.menuService.getMenus().subscribe(
      (response: any) => this.handleSuccessfulResponse(response)

    );
    
  }
  handleSuccessfulResponse(response: any) { 
    this.menus = response;
    console.log(this.menus)
  }
  
}

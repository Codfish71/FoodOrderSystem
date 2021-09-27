import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Menu } from './menu';

@Injectable({
  providedIn: 'root'
})
export class MenuService {
  

  constructor(private httpClient:HttpClient) { }

  getMenus() {
    return this.httpClient.get<Menu[]>('http://localhost:8080/admin/menus');
  }
}

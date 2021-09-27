import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Food } from './food';

@Injectable({
  providedIn: 'root'
})
export class FoodService {
  addFoodItem(food:Food):Observable<any> {
    return this.httpClient.post<any>("http://localhost:8080/admin/foodItems/",food);
  }
  deleteFoodItem(id: number) {
    return this.httpClient.delete('http://localhost:8080/admin/foodItems/'+id);
  }
  getFoodItems() {
    return this.httpClient.get<Food[]>('http://localhost:8080/admin/foodItems');
  }

   constructor(private httpClient:HttpClient) { }
}

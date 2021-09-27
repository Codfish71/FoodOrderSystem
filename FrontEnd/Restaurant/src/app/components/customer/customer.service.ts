import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from './customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  
  constructor(private httpClient:HttpClient) { }

  public loginCustomerFromRest(customer:Customer):Observable<any>{
    return this.httpClient.post<any>("http://localhost:8080/customer/login",customer);
  }

  public getCurrentCustomer() {
      let customerEmail = localStorage.getItem('customerEmail');
      const newUrl = "http://localhost:8080/customer/profile" + customerEmail;
      return this.httpClient.get(newUrl);
  }



  public registerCustomerRest(customer:Customer):Observable<any> {
    return this.httpClient.post<any>("http://localhost:8080/customer/register",customer); 
  }
}

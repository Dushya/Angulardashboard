import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RegisteredNotParticipatedService {
  private baseUrl = 'http://localhost:8082/api/regnotpart'
  private updatebaseUrl = 'http://localhost:8082/api/regnotpart/update';
  
    constructor(private http: HttpClient) { }

    update(eventID: string,empID:number,value: any): Observable<Object> {
      console.log("Update Value",`${this.updatebaseUrl}/${eventID}/${empID}`,value)
      return this.http.put(`${this.updatebaseUrl}/${eventID}/${empID}`, value);
    }

    getRegnotPartData(): Observable<any> {
      return this.http.get(`${this.baseUrl}`);
    }


}

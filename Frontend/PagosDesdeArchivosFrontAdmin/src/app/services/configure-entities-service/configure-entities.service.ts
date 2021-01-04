import { Injectable } from '@angular/core';
import { HttpClient }from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ConfigureEntitiesService {
  urlAPI = 'http://localhost:8080/api/configureEnti';

  constructor(private http: HttpClient) { }

  getEntities(){
    return this.http.get(this.urlAPI + 'ties');
  }

  getEntityById(id: string){
    return this.http.get(this.urlAPI + `ty?id=${id}`);
  }
}

import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  sessione: string;

  constructor(private http: HttpClient){}

  registrazione() {
    
  }
  inviaTutti(){}
  invia(){}
  aggiorna(){}
}

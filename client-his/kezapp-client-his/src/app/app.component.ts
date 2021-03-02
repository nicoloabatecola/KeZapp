import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Chat } from './chat';
import { Messaggio } from './messaggio';
import { RegistrazioneDto } from './registrazione-dto';
import { RichiediRegistrazioneDto } from './richiedi-registrazione-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  sessione: string;
  contatti: Chat[] = [];
  messaggi: Messaggio[] = [];
  req = new RichiediRegistrazioneDto();
  reg = new RegistrazioneDto();

  constructor(private http: HttpClient) { }

  registrazione() {
    let oss = this.http.post<RegistrazioneDto>("http://localhost:8080/registrazione", this.req);
    oss.subscribe(r => {
      this.sessione = r.sessione;
      this.contatti = r.contatti;
    });
    this.req.nickname = "";
  }
  inviaTutti() { }
  invia() { }
  aggiorna() { 
    let oss = this.http.get<Chat[]>("http://localhost:8080/aggiorna");
    oss.subscribe(r => {
      this.contatti = r;
    });
  }
}

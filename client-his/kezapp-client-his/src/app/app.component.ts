import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Chat } from './chat';
import { InviaMessaggioDto } from './invia-messaggio-dto';
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
  erroreNickname: string;
  req = new RichiediRegistrazioneDto();
  reg = new RegistrazioneDto();
  inviaMessaggioDto = new InviaMessaggioDto();

  constructor(private http: HttpClient) { }

  registrazione() {
    if (this.req.nickname) {
      let oss = this.http.post<RegistrazioneDto>("http://localhost:8080/registrazione", this.req);
      oss.subscribe(r => {
        if (r.sessione == null) {
          this.erroreNickname = "Nickname non disponibile";
        } else {
          this.sessione = r.sessione;
          this.contatti = r.contatti;
        }
      });
    }else this.erroreNickname = "messaggio errore";
  }
  inviaTutti() {
    this.inviaMessaggioDto.destinatario = "tutti";
    this.inviaMessaggioDto.sessione = this.sessione;
    let oss = this.http.post<RegistrazioneDto>("http://localhost:8080/inviatutti", this.inviaMessaggioDto);
    oss.subscribe(r => {
      //this.contatti = r.contatti;
      //this.messaggi = r.messaggi;
    });
   }
  invia() { }
  aggiorna() {
    let oss = this.http.get<Chat[]>("http://localhost:8080/aggiorna");
    oss.subscribe(r => {
      this.contatti = r;
    });
  }
}

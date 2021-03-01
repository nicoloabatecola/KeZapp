import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { RegistrazioneDto } from './registrazione-dto';
import { RichiediRegistrazioneDto } from './richiedi-registrazione-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  sessione: string;
  req = new RichiediRegistrazioneDto();
  reg = new RegistrazioneDto();

  constructor(private http: HttpClient) { }

  registrazione() {
    let oss = this.http.post<RegistrazioneDto>("/registrazione", this.req);
    oss.subscribe(r => {
      this.reg = r;
      this.req.nickname = "";
    });
  }
  inviaTutti() { }
  invia() { }
  aggiorna() { }
}

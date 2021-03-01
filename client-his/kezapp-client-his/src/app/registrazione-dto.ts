import { Chat } from "./chat";
import { Messaggio } from "./messaggio";

export class RegistrazioneDto {
    contatti: Chat[];
    messaggi: Messaggio[];
    sessione: string;
}
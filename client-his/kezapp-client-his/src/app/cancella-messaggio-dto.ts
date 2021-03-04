import { Messaggio } from "./messaggio";

export class CancellaMessaggioDto{

    messaggioDaCancellare : Messaggio;
    sessione: string;
}
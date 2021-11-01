import {Server} from "./server";

export interface CustomResponse{
  timeStamp: Date;
  statsCode: number;
  status: string;
  reason: string;
  message: string;
  developerMessage: string;
  data: {servers?: Server[], server?: Server};


}

import { Component, OnInit,ChangeDetectorRef } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ApiService } from '../services/api';

@Component({
  selector: 'app-api-logs',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './api-logs.html',
  styleUrls: ['./api-logs.css']
})
export class ApiLogsComponent implements OnInit {
logs: any[] = [];

  constructor(private apiService: ApiService ,
    private cdr: ChangeDetectorRef
  ) { }

  ngOnInit(): void {
    console.log('Fetching logs for Payment API...');
   // this.apiService.getLogs('Payment API').subscribe( data => {
   this.apiService.getLogs().subscribe( data => {
        console.log(data);
        this.logs = data ;
        this.cdr.detectChanges();
    });
  }
}
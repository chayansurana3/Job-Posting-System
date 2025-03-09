import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-create-job',
  templateUrl: './create-job.component.html',
  styleUrls: ['./create-job.component.css'],
  imports: [FormsModule]
})
export class CreateJobComponent {
  job = {
    title: '',
    description: '',
    location: '',
    salary: ''
  };

  postJob() {
    console.log('Job Posted:', this.job);
  }
}
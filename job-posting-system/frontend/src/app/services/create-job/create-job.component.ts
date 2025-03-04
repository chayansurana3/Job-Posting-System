import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-create-job',
  templateUrl: './create-job.component.html',
  styleUrls: ['./create-job.component.css']
})
export class CreateJobComponent {
  onSubmit(form: NgForm) {
    if (form.valid) {
      const jobData = form.value;
      console.log('Job Data:', jobData);
      // Here you can add the logic to send the job data to your backend API
    }
  }
}
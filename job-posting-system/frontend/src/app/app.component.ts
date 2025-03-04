import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { CandidateRegistrationComponent } from './candidate-registration/candidate-registration.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { CreateJobComponent } from './create-job/create-job.component';
import { HomeComponent } from './components/home/home.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  standalone: true,
  imports: [RouterOutlet, CandidateRegistrationComponent, NavbarComponent, CreateJobComponent, HomeComponent ]
})
export class AppComponent {
  title = 'job-posting-frontend';
}
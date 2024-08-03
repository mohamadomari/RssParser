# RSS Parser Project

## Description
This project is a web application that reads job listings from the Bayt RSS feed, parses the job titles and locations, and displays them in a table. The application also plots the job locations on a Google Map.

## Features
- Fetches job listings from the Bayt RSS feed.
- Parses the job titles and locations.
- Displays job titles and locations in a table.
- Plots job locations on a Google Map.
- Allows viewing of all job locations on the map.

## Technologies Used
- **Backend**: Java, Spring Boot
- **Frontend**: HTML, CSS, JavaScript
- **Dependencies**: Maven for dependency management
- **Map**: Google Maps API

## Prerequisites
- Java 8 or higher
- Maven
- Internet connection (for fetching RSS feed and Google Maps API)

## Installation and Setup

1. **Clone the repository:**
    ```bash
    git clone <repository_url>
    cd rssparser
    ```

2. **Set up your Google Maps API Key:**
    - Go to the [Google Cloud Console](https://console.cloud.google.com/).
    - Create a new project or select an existing project.
    - Enable the Google Maps JavaScript API.
    - Generate an API key.
    - Replace the `YOUR_GOOGLE_MAPS_API_KEY` placeholder in the `index.html` file with your actual API key.

3. **Build the project:**
    ```bash
    mvn clean install
    ```

4. **Run the project:**
    ```bash
    mvn spring-boot:run
    ```

5. **Access the application:**
    - Open your web browser and go to `http://localhost:8080`.

## Project Structure

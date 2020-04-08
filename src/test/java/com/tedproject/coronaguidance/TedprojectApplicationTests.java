package com.tedproject.coronaguidance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TedprojectApplicationTests {

	@Test
	void contextLoads() {
	}

// Banner for all pages	
	@Test
	@DisplayName("PlagueInc Banner")
	void bannerTest() throws IOException {
		URL url = new URL("https://gamehag.com//img/rewards/background/plague-inc-evolved-steam-cd-key_max.jpg");
		HttpURLConnection urlCon = (HttpURLConnection) url.openConnection();
		int response = urlCon.getResponseCode();
		assertEquals(HttpURLConnection.HTTP_OK, response);
	}

// URLs in prevention.jsp	 

	@Test
	@DisplayName("CDC Prevention link")
	void cdcURLLink() throws IOException {
		URL url = new URL("https://www.cdc.gov/coronavirus/2019-ncov/prepare/index.html");
		HttpURLConnection urlCon = (HttpURLConnection) url.openConnection();
		int response = urlCon.getResponseCode();
		assertEquals(HttpURLConnection.HTTP_OK, response);
	}

	@Test
	@DisplayName("WHO Prevention link")
	void whoURLLink() throws IOException {
		URL url = new URL("https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public");
		HttpURLConnection urlCon = (HttpURLConnection) url.openConnection();
		int response = urlCon.getResponseCode();
		assertEquals(HttpURLConnection.HTTP_OK, response);
	}

// URLs in symptoms.jsp

	@Test
	@DisplayName("1177 Symptoms link")
	void elevenSeventySixURLLink() throws IOException {
		URL url = new URL(
				"https://www.1177.se/Skane/sjukdomar--besvar/infektioner/ovanliga-infektioner/covid-19-coronavirus/");
		HttpURLConnection urlCon = (HttpURLConnection) url.openConnection();
		int response = urlCon.getResponseCode();
		assertEquals(HttpURLConnection.HTTP_OK, response);
	}

	@Test
	@DisplayName("CDC Symptoms link")
	void cdcSymptomsURLLink() throws IOException {
		URL url = new URL("https://www.cdc.gov/coronavirus/2019-ncov/symptoms-testing/symptoms.html");
		HttpURLConnection urlCon = (HttpURLConnection) url.openConnection();
		int response = urlCon.getResponseCode();
		assertEquals(HttpURLConnection.HTTP_OK, response);
	}

	@Test
	@DisplayName("MayoClinic Symptoms link")
	void mayoClinicSymptomsURLLink() throws IOException {
		URL url = new URL(
				"https://www.mayoclinic.org/diseases-conditions/coronavirus/symptoms-causes/syc-20479963");
		HttpURLConnection urlCon = (HttpURLConnection) url.openConnection();
		int response = urlCon.getResponseCode();
		assertEquals(HttpURLConnection.HTTP_OK, response);
	}

// URLs in whatis.jsp	  

	@Test
	@DisplayName("MayoClinic Symptoms link")
	void wikipediaURLLink() throws IOException  {
		URL url = new URL("https://en.wikipedia.org/wiki/Coronavirus_disease_2019");
		HttpURLConnection urlCon = (HttpURLConnection) url.openConnection();
		int response = urlCon.getResponseCode();
		assertEquals(HttpURLConnection.HTTP_OK, response);
	}
	
}

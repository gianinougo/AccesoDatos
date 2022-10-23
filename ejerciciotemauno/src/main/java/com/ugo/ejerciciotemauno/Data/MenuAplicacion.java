package com.ugo.ejerciciotemauno.Data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class MenuAplicacion {
	
	Scanner sc = new Scanner(System.in);
	String jsonString;
	String jsonString2;
	
	
	public void MenuText() {
		System.out.println("1 - Ciudad por lat y Long");
		System.out.println("2 - Ciudad por nombre");
	    System.out.println("3 - Ejercicio 3");
	    System.out.println("4 - Serializar");
	    System.out.println("5 - Ejercicio 5");
	    System.out.println("6 - Personaje de Marvel");
	    System.out.println("7 - Exit");
		
	}
	
	
	public void Ejecutar() {
		
		int option;
		
		do {
			
			MenuText();
			
			System.out.print("Enter an option: ");
			
			option = sc.nextInt();
			
			switch (option) {
			case 1:
				CiudadPorCoordenadas();
				break;
			case 2:
				CidudadNombre();
				break;
			case 3:

				break;
			case 4:
				SerializarDatos();
				break;
			case 5:
				DeserializarDatos();
				break;
			case 6:
				PersonajeMarvel();
				break;
			case 7:
				System.out.println("Exit");
				break;

			default:
				System.out.println("Invalid Option");
				break;
			}
			
		} while(option != 7);
	}


	private void DeserializarDatos() {
		
		File fichero = new File("ubicaciones.json");
		try {
			FileInputStream ficheroSalida = new FileInputStream(fichero);
			ObjectInputStream ficheroObjetos = new ObjectInputStream(ficheroSalida);
			Gson gson = new Gson();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	private void SerializarDatos() {
		// Guardar JSon
		
		if (jsonString != null) {
			try {
				PrintWriter pw = new PrintWriter("ubicaciones.json");
				pw.write(jsonString);
				pw.flush();
				pw.close();
				System.out.println("Archivo creado");

				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("No hay datos");
		}
		
		if (jsonString2 != null) {
			try {
				PrintWriter pw = new PrintWriter("nombreCiudad.json");
				pw.write(jsonString2);
				pw.flush();
				pw.close();
				System.out.println("Archivo creado");

				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("No hay datos");
		}
		


	}


	private void PersonajeMarvel() {
		String personajeMarver;
		
		try {
			
			//1cd6e70ae3f0ca9a4bcf2d2c38768624a4fe4b424b34e5ddf6f334adb197a35f424661e90
			//MD5
			//4814ba01ccb583037ff61bebca1b1185
					
					System.out.print("Enter an character: ");
					personajeMarver = sc.next();
					
					
					URL url = new URL("https://gateway.marvel.com:443/v1/public/characters?name="
					+ personajeMarver +"&ts=1&apikey=b34e5ddf6f334adb197a35f424661e90&hash=4814ba01ccb583037ff61bebca1b1185");

					
					HttpURLConnection connection = (HttpURLConnection) url.openConnection();
					connection.setRequestMethod("GET");
					connection.connect();
					
					//¿Petición correcta?
					
					int responseCode = connection.getResponseCode();
					if (responseCode != 200) {
						throw new RuntimeException("Ocurrio un error " + responseCode);
					} else {
						// Abrir un scanner que lea el flujo de datos
						
						StringBuilder informationString = new StringBuilder();
						Scanner scanner = new Scanner(url.openStream());
						
						while (scanner.hasNext()) {
							informationString.append(scanner.nextLine());
						}
						
						scanner.close();
						
						// Pintar la información en consola
						
						System.out.println(informationString);
						
						
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
		
	}


	private void CidudadNombre() {
		
		String nameCityString;
		
try {
			
			System.out.print("Enter an City: ");
			nameCityString = sc.next();
			
			//https://api.openweathermap.org/data/2.5/weather?q=madrid&mode=xml&appid=c493f3a45248ed9d8cb1fe7997858cff
			//URL url = new URL("https://api.openweathermap.org/data/2.5/weather?lat=38.3452&lon=-0.4815&mode=xml&appid=c493f3a45248ed9d8cb1fe7997858cff");
			URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q="+ nameCityString +"&mode=xml&appid=c493f3a45248ed9d8cb1fe7997858cff");

			
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();
			
			//¿Petición correcta?
			
			int responseCode = connection.getResponseCode();
			if (responseCode != 200) {
				throw new RuntimeException("Ocurrio un error " + responseCode);
			} else {
				// Abrir un scanner que lea el flujo de datos
				
				StringBuilder informationString = new StringBuilder();
				Scanner scanner = new Scanner(url.openStream());
				
				while (scanner.hasNext()) {
					informationString.append(scanner.nextLine());
				}
				
				scanner.close();
				
				// Pintar la información en consola
				
				Gson gson = new GsonBuilder().setPrettyPrinting().create();
				//Gson gson = new Gson();
				jsonString2 = gson.toJson(informationString);
				System.out.println(jsonString2);
				
				System.out.println(informationString);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	private void CiudadPorCoordenadas()  {

		double lat;
		double lon;
		
		
			
		try {
			
			System.out.print("Enter an lat: ");
			lat = sc.nextFloat();
			
			
			System.out.print("Enter an log: ");
			lon = sc.nextFloat();
			
			
			//URL url = new URL("https://api.openweathermap.org/data/2.5/weather?lat=38.3452&lon=-0.4815&appid=c493f3a45248ed9d8cb1fe7997858cff");
			URL url = new URL("https://api.openweathermap.org/data/2.5/weather?lat="+ lat +"&lon="+ lon + "&appid=c493f3a45248ed9d8cb1fe7997858cff");

			
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();
			
			//¿Petición correcta?
			
			int responseCode = connection.getResponseCode();
			if (responseCode != 200) {
				throw new RuntimeException("Ocurrio un error " + responseCode);
			} else {
				// Abrir un scanner que lea el flujo de datos
				
				StringBuilder informationString = new StringBuilder();
				Scanner scanner = new Scanner(url.openStream());
				
				while (scanner.hasNext()) {
					informationString.append(scanner.nextLine());
				}
				
				scanner.close();
				
				// Pintar la información en consola
				
				Gson gson = new GsonBuilder().setPrettyPrinting().create();
				//Gson gson = new Gson();
				jsonString = gson.toJson(informationString);
				System.out.println(jsonString);
				
				
				
				
				//JSONObject jObject =  new JSONObject(informationString.toString());
				//JSONArray array = jObject.getJSONArray("coord");
				//System.out.println(jObject);
				
//				JSONArray array = new JSONArray(informationString.toString());
//				JSONObject jObject =  array.getJSONObject(0);
				
				//System.out.println(informationString);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		
		
	}
	
	
}

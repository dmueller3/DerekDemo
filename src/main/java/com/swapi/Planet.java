package com.swapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Planet{
	private List<String> films;
	private String edited;
	private String created;
	private String climate;
	private String rotationPeriod;
	private String url;
	private String population;
	private String orbitalPeriod;
	private String surfaceWater;
	private String diameter;
	private String gravity;
	private String name;
	private List<String> residents;
	private String terrain;

	public void setFilms(List<String> films){
		this.films = films;
	}

	public List<String> getFilms(){
		return films;
	}

	public void setEdited(String edited){
		this.edited = edited;
	}

	public String getEdited(){
		return edited;
	}

	public void setCreated(String created){
		this.created = created;
	}

	public String getCreated(){
		return created;
	}

	public void setClimate(String climate){
		this.climate = climate;
	}

	public String getClimate(){
		return climate;
	}

	public void setRotationPeriod(String rotationPeriod){
		this.rotationPeriod = rotationPeriod;
	}

	public String getRotationPeriod(){
		return rotationPeriod;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setPopulation(String population){
		this.population = population;
	}

	public String getPopulation(){
		return population;
	}

	public void setOrbitalPeriod(String orbitalPeriod){
		this.orbitalPeriod = orbitalPeriod;
	}

	public String getOrbitalPeriod(){
		return orbitalPeriod;
	}

	public void setSurfaceWater(String surfaceWater){
		this.surfaceWater = surfaceWater;
	}

	public String getSurfaceWater(){
		return surfaceWater;
	}

	public void setDiameter(String diameter){
		this.diameter = diameter;
	}

	public String getDiameter(){
		return diameter;
	}

	public void setGravity(String gravity){
		this.gravity = gravity;
	}

	public String getGravity(){
		return gravity;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setResidents(List<String> residents){
		this.residents = residents;
	}

	public List<String> getResidents(){
		return residents;
	}

	public void setTerrain(String terrain){
		this.terrain = terrain;
	}

	public String getTerrain(){
		return terrain;
	}

	@Override
 	public String toString(){
		return 
			"Planet{" + 
			"films = '" + films + '\'' + 
			",edited = '" + edited + '\'' + 
			",created = '" + created + '\'' + 
			",climate = '" + climate + '\'' + 
			",rotation_period = '" + rotationPeriod + '\'' +
			",url = '" + url + '\'' + 
			",population = '" + population + '\'' + 
			",orbital_period = '" + orbitalPeriod + '\'' + 
			",surface_water = '" + surfaceWater + '\'' + 
			",diameter = '" + diameter + '\'' + 
			",gravity = '" + gravity + '\'' + 
			",name = '" + name + '\'' + 
			",residents = '" + residents + '\'' + 
			",terrain = '" + terrain + '\'' + 
			"}";
		}
}
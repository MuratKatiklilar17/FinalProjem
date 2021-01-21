package com.example.demo;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/hasta")
public class HastaRestApi {

	public static List<String> hastalar = new ArrayList<>();
	@GetMapping("/listele")
	@ResponseBody
	public List<String> listele(){
		return hastalar;
	}
	
	@PostMapping("/ekle")
	@ResponseBody
	public String ekle(@RequestBody String ad) {
		hastalar.add(ad);
		return ad;
	}
	
	@PostMapping("/Sil")
	@ResponseBody
	public String sil(@RequestBody String ad) {
		hastalar.clear();
		return ad;
 }
}

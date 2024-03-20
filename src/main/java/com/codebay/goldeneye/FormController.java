package com.codebay.goldeneye;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class FormController {
    @PostMapping("/formProcess")
    public String formProcess(@RequestParam("name") String name,
                              @RequestParam("surname") String surname,
                              @RequestParam("location") String location,
                              @RequestParam("department") String department,
                              Model model){

        //Provisionally, unappropriated words aren't checked
        //String nameAndSur = name.replace(" ", "").toLowerCase().charAt(0) +
        //        surname.replace(" ", "").toLowerCase()
        String nameAndSur = appropriatedName(name, surname);

        //Here add the call to a function that checks unappropriated words: badWordsChecker(name, surname)
        String email = nameAndSur + "." + department + "@" + location + ".goldeneye.com";
        model.addAttribute("email", email);

        return "result";
    }

    //Implement the function: public String badWordsChecker(String name, String surname)
    //This function will return the name and surname combination without unappropriated words
    public String appropriatedName(String name, String surname){
        ArrayList<String> badWords = new ArrayList<>(Arrays.asList("bitch", "sex", "dick", "penis"));
        String nameAndSurname = name.replace(" ", "").toLowerCase().charAt(0) +
                surname.replace(" ", "").toLowerCase();

        for(String badWord : badWords){
            if(nameAndSurname.contains((badWord))){
                nameAndSurname = nameAndSurname.substring(1);
            }
        }
        return nameAndSurname;
    }
}

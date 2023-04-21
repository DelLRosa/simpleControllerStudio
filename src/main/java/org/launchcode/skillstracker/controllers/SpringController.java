package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class SpringController {
    @GetMapping
    @ResponseBody
    public String welcomeMessage(){
        return "<html>\n" +
                "<body>\n" +
                "\n" +
                "<h1>Skills Tracker</h1>\n" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>\n" +
                "<ol>\n" +
                "<li>JavaScript</li>\n" +
                "<li>Java</li>\n" +
                "<li>CSS</li>\n" +
                "</ol>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
    }

    @PostMapping("form")
    @ResponseBody
    public String formResponse(@RequestParam String name, String langOne, String langTwo, String langThree){
        return "<html>" +
                "<body>" +
                "<h1>"+name+"</h1>" +
                "<ol>" +
                "<li>"+langOne+"</li>" +
                "<li>"+langTwo+"</li>" +
                "<li>"+langThree+"</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String skillForm(){
        return "<html>\n" +
                "<body>\n" +
                "\n" +
                "<form method='post'>\n" +
                "  <label name='name'>name:</label>\n" +
                "  <input type='text' name='name'>\n" +

                "<label>My Favorite Language:</label>\n" +
                "<select name='langOne' id='langOne'>\n" +
                "  <option value='javascript'>JavaScript</option>\n" +
                "  <option value='java'>Java</option>\n" +
                "  <option value='css'>CSS</option>\n" +
                "</select>\n" +
                "\n" +
                "<label>My Second Favorite Language:</label>\n" +
                "<select name='langTwo' id='langTwo'>\n" +
                "  <option value='javascript'>JavaScript</option>\n" +
                "  <option value='java'>Java</option>\n" +
                "  <option value='css'>CSS</option>\n" +
                "</select>\n" +
                "" +
                "<label>My Third Favorite Language:</label>\n" +
                "<select name='langThree' id='langThree'>\n" +
                "  <option value='javascript'>JavaScript</option>\n" +
                "  <option value='java'>Java</option>\n" +
                "  <option value='css'>CSS</option>\n" +
                "</select>\n" +
                "" +
                "<input type='submit' value= 'Submit'>\n" +
                "</form>" +
                "</body>\n" +
                "</html>";

    }
}

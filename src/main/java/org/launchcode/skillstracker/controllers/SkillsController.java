package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("/")
    public String displayHomePage() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h3>We have a few skills we should learn. Here is the list.</h3>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>TypeScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "<p>Click <a href='/form'>here</a> to select your favorites</p>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    public String displaySkillsForm() {
        return "<html>" +
                "<body>" +
                "<form action='/results' method='POST'>" +
                "<label>Name:</label>" +
                "<input type='text' name='userName' />" +
                "<label>My favorite language:</label>" +
                "<select name='fave1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='TypeScript'>TypeScript</option>" +
                "<option value='python'>Python</option>" +
                "<select>" +
                "<label>My second favorite language:</label>" +
                "<select name='fave2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='TypeScript'>TypeScript</option>" +
                "<option value='Python'>Python</option>" +
                "<select>" +
                "<label>My third favorite language:</label>" +
                "<select name='fave3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='TypeScript'>TypeScript</option>" +
                "<option value='Python'>Python</option>" +
                "<select>" +
                "<input type='submit' value='Submit' />" +
                "</form>" +
                "</body>" +
                "</html>";

    }

    @PostMapping("/results")
    public String skillsOutput(@RequestParam String userName, String fave1, String fave2, String fave3) {
        return "<html>" +
                "<body>" +
                "<h1>" + userName +"</h1>" +
                "<ol>" +
                "<li>" + fave1 + "</li>" +
                "<li>" + fave2 + "</li>" +
                "<li>" + fave3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

}

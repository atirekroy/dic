package in.timemac.dictionary.controller;

import in.timemac.dictionary.model.Word;
import in.timemac.dictionary.repo.DictionaryRepository;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MeaningController {

    @Autowired
    DictionaryRepository repository;


    @GetMapping(value = "/{word}")
    public String getWord(@PathVariable String word) {
        List<Word> result = (List<Word>)repository.findByWordItem(word);
        JSONObject json = new JSONObject();
        for ( Word eachWord : result){
                json.put("word",eachWord.getWordItem());
                json.put("category",eachWord.getCategory());
                json.put("meaning", eachWord.getMeaning());
        }
        return json.toString();
    }



}
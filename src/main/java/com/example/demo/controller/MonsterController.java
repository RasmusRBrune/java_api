package com.example.demo.controller;

import com.example.demo.entities.MonsterModel;
import com.example.demo.repositories.MonsterRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/api/monster/")
public class MonsterController {

    @Autowired
    private MonsterRep rep;

    @GetMapping("getmonsterbyid/{id}")
    @ResponseBody
    public ResponseEntity<MonsterModel> getMonsterById(@PathVariable long id) throws  Exception{
        MonsterModel model = rep.findById(id).orElseThrow(()-> new Exception("error"));
        return ResponseEntity.ok().body(model);
    }

    @GetMapping("getall")
    @ResponseBody
    public List<MonsterModel> getAll(){
        return rep.findAll();
    }

    @PostMapping("addmonter")
    @ResponseBody
    public MonsterModel saveMonster(@RequestBody MonsterModel body){
        return rep.save(body);
    }

    @PutMapping("updatemonster")
    @ResponseBody
    public MonsterModel updateMonster(@Valid @RequestBody MonsterModel body){
        return rep.save(body);
    }

    @DeleteMapping("delete/{id}")
    @ResponseBody
    public ResponseEntity<String> deleteMonster(@PathVariable long id){
         rep.deleteById(id);
         return ResponseEntity.ok().body("delete");
    }
}

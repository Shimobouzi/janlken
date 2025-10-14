package oit.is.z3193.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.z3193.kaizi.janken.model.Janken;

/**
 * @RequestMapping("/sample26")をクラスの前につけると，このクラスのすべてのメソッドは/sample26で呼び出されることを表す
 */
@Controller
@RequestMapping("/janken11")
public class JankenController {

  @GetMapping
  public String janken12() {
    return "janken.html";
  }

  /**
   * メソッド名は異なるが，/sample26というPOSTリクエストがあったら，こちらが呼び出されて，sample26.htmlが返る．一つのリクエストに対してPOST，GET両方を使い分けることができる
   * ArrayListオブジェクトをModelMapの変数に直接与えて，thymeleafにわたすことができる
   *
   * @return
   */
  @PostMapping
  public String janken13(@RequestParam String name, ModelMap model) {
    model.addAttribute("name", name);
    return "janken.html";
  }
}

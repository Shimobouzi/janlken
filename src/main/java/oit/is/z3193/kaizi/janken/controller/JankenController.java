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
@RequestMapping("/janken")
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

  /**
   * クエリパラメータの引数2つを受け付ける URLでの?のあとのパラメータ名とjavaメソッドの引数名は同じであることが望ましい(別にする方法は一応ある)
   * 引数をStringとして受け取ってparseIntする以外にもInteger(intのラッパークラス)クラスの変数として受け取ってそのまま加算する方法もある
   *
   * @param hand
   * @param model
   * @return
   */
  @GetMapping("/vs")
  public String janken14(@RequestParam String hand, ModelMap model) {
    Janken janken = new Janken(hand);
    model.addAttribute("result", janken.getResult());
    return "janken.html";
  }

}

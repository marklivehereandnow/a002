/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.ages.card;

/**
 *
 * @author mark
 */
public interface AgesCommon {
    String[] REASON_WHY={
        "Game is not started yet!",
    "First round is only allow to take, not to build"
    
    };
    int REASON_GAME_NOT_YET_STARTED=0;
    int REASON_FIRST_ROUND_NOT_ALLOW_TO_BUILD=1;
//    int
//    int NO_ACTION_REASON_GAME_NOT_YET_STARTED=1;
    
    
    
    
    int[] COST_OF_TAKING_CARD_FROM_CARDROW = {1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3};
 
//    String[] 階段={"unknown","xxx","yyy"};
    int STYLE_政府區 = 100;
    int STYLE_領袖區 = 101;
    int STYLE_實驗室 = 109;
    int STYLE_建造中的奇蹟區 = 102;
    
    int STYLE_已完成的奇蹟 = 103;
    int STYLE_行動牌 = 105;
    int STYLE_普通 = 999;
    int STYLE_普通_藍點 = 1001;
//    String[] AGE_NAME = {"\uFF21", "\uFF29", "\uFF29\uFF29", "\uFF29\uFF29\uFF29"};//http://www.unicode.org/charts/PDF/UFF00.pdf
    String[] AGE_NAME = {"\uFF21", "I ", "II ", "III "};//http://www.unicode.org/charts/PDF/UFF00.pdf
    final String[] STAGE_NAME = {" ", "政治", "內政"};
//    final String[] AGE_NAME = {"A", "I", "II", "III"};
    final String FULLWIDTH_COLON = "\uFF1A";//;
    final String FULLWIDTH_SPACE = "\u3000";
    final String FULLWIDTH_LT_SIGN = "\uFF1C";// <
    final String FULLWIDTH_EQ_SIGN = "\uFF1D";// =
    final String FULLWIDTH_GT_SIGN = "\uFF1E";// >

}

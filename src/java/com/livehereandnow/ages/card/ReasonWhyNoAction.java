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
public enum ReasonWhyNoAction {

    按遊戲規則_第一回合_只能拿牌_不能做建造,
    GAME_IS_NOT_STARTED_YET,
    NOT_VALID_INDEX_FROM_CARDROW,
    內政點數不够,
    資源不够,
    拿了重複的科技牌,
    UNDER_CONSTRUCTION_IS_NOT_EMPTY,
    NOT_THE_奇蹟CARD_UNDER_CONSTRUCTION,
    NOT_YET_DEFINED;
//    @Override
//    public String toString() {
//        switch (this) {
//            case GAME_IS_NOT_STARTED_YET:
//                return "GAME IS NOT YET STARTED";
//            case NOT_VALID_INDEX_FROM_CARDROW:
//                return "NOT A VALID INDEX";
//            case 內政點數不够:
//                return "內政點數不够";
//            case 拿了重複的科技牌:
//                return "拿了重複的科技牌";
//
//            default:
//                return "TODO... ADD IT TO toString";
//        }
//    }
}

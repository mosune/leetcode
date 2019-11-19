package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 720. 词典中最长的单词
 *
 * 给出一个字符串数组words组成的一本英语词典。从中找出最长的一个单词，该单词是由words词典中其他单词逐步添加一个字母组成。若其中有多个可行的答案，则返回答案中字典序最小的单词。
 *
 * 若无答案，则返回空字符串。
 *
 * 示例 1:
 *
 * 输入:
 * words = ["w","wo","wor","worl", "world"]
 * 输出: "world"
 * 解释:
 * 单词"world"可由"w", "wo", "wor", 和 "worl"添加一个字母组成。
 * 示例 2:
 *
 * 输入:
 * words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
 * 输出: "apple"
 * 解释:
 * "apply"和"apple"都能由词典中的单词组成。但是"apple"得字典序小于"apply"。
 * 注意:
 *
 * 所有输入的字符串都只包含小写字母。
 * words数组长度范围为[1,1000]。
 * words[i]的长度范围为[1,30]。
 *
 * @author gcg
 * @create 2019-11-19 17:14
 **/
public class SevenHundredTwenty {

//    public String longestWord(String[] words) {
//        Arrays.sort(words);
//        Set<String> strings = new HashSet<>(words.length);
//
//        for (String str : words) {
//            if (str.length() == 1) strings.add(str);
//            else if (strings.contains(str.substring(0, str.length() - 1))) strings.add(str);
//        }
//
//        int max = -1;
//        String string = null;
//        for (String str : strings) {
//            if (str.length() > max) {
//                string = str;
//                max = str.length();
//            } else if (str.length() == max) {
//                for (int i = 0; i < str.length(); i++) {
//                    if (str.charAt(i) > string.charAt(i)) break;
//                    if (str.charAt(i) < string.charAt(i)) {
//                        string = str;
//                        break;
//                    }
//                }
//            }
//        }
//
//        return string;
//    }

    public static String longestWord(String[] words) {
        Arrays.sort(words);
        TrieNode trieNode = new TrieNode('0');

        for (String string : words) {
            char[] chars = string.toCharArray();

        }


        return null;
    }

}

// todo 完善前缀树

class TrieNode {

    char val;

    Map<Character, TrieNode> childrens;

    int num;

    TrieNode(char c) {
        this.val = c;
        childrens = new HashMap<>();
    }

}

class Trie {

    TrieNode trieNode;

    Trie(char c) {
        trieNode = new TrieNode('0');
    }

    void insert(String str) {
        TrieNode node = trieNode;
        TrieNode newNode;
        char[] chars = str.toCharArray();
        for (char c : chars) {
            newNode = node.childrens.get(c);
            if (newNode == null) {
                newNode = new TrieNode(c);
                node.childrens.put(c, newNode);
            }
            node = newNode;
        }
    }

}

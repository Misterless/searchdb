package site.metacoding.searchv1.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import site.metacoding.searchv1.domain.boardTbl.BoardTblRepository;
import site.metacoding.searchv1.domain.boardTbl.boardTbl;

@Controller
public class BoardTblController {
    private BoardTblRepository boardTblRepository;

    public BoardTblController(BoardTblRepository boardTblRepository){

        this.boardTblRepository= boardTblRepository;
    }
    
    
    @GetMapping("/")
    public String search(@RequestParam(defaultValue="") String keyword, Model model){
       
        System.out.println();
        List<boardTbl> boards = boardTblRepository.mSearch(keyword);
        model.addAttribute("boards",boards);
        return "main";
    }
}

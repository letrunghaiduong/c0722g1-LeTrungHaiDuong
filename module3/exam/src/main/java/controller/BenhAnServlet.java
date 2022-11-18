package controller;

import model.BenhAn;
import model.BenhNhan;
import service.IBenhAnService;
import service.impl.BenhAnService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BenhAnServlet",value = "/benhAn")
public class BenhAnServlet extends HttpServlet {
    private IBenhAnService benhAnService = new BenhAnService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "edit":
                edit(request,response);
            default:
                benhAnList(request,response);
        }
    }

    private void edit(HttpServletRequest request, HttpServletResponse response) {
        String maBenhAn = request.getParameter("maBenhAn");
        String maBenhNhan = request.getParameter("maBenhNhan");
        String tenBenhNhan = request.getParameter("tenBenhNhan");
        String ngayNhapVien = request.getParameter("ngayNhapVien");
        String ngayRaVien = request.getParameter("ngayRaVien");
        String lyDoNhapVien = request.getParameter("lyDoNhapVien");
        String phuongPhapDieuTri = request.getParameter("phuongPhapDieuTri");
        String bacSiDieuTri = request.getParameter("bacSiDieuTri");
        BenhNhan benhNhan = new BenhNhan(maBenhNhan,tenBenhNhan);
        BenhAn benhAn = new BenhAn(maBenhAn,maBenhNhan,benhNhan,ngayNhapVien,ngayRaVien,lyDoNhapVien,phuongPhapDieuTri,bacSiDieuTri);
        request.setAttribute("benhAn",benhAn);
        benhAnService.update(benhAn);
        try {
            request.getRequestDispatcher("/view/edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "edit":
                formEdit(request,response);
                break;
            default:
                benhAnList(request,response);
        }
    }

    private void formEdit(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("/view/edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void benhAnList(HttpServletRequest request, HttpServletResponse response) {
        List<BenhAn> benhAnList = benhAnService.findAll();
        request.setAttribute("benhAnList",benhAnList);
        try {
            request.getRequestDispatcher("/view/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

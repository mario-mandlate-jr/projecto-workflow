package com.mario.workflow.com.mario.workflow.views;

import java.util.Collections;

import com.mario.workflow.com.mario.workflow.models.ProdutoRequisicao;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Lista de requisição")
@Route(value = "list")
public class ListaRequisicaoForm extends VerticalLayout{
	
	Grid<ProdutoRequisicao> grid = new Grid<>(ProdutoRequisicao.class);
	
	ComboBox<String> departamento = new ComboBox<>("Departamento");
	
	Button add = new Button("Adicionar Produto");
	
	FormularioRequisicaoForm form;
	
	
	public ListaRequisicaoForm() {
		addClassNames("list-view");
		setSizeFull();
		
		configureGrid();
		configureForm();
		
		add( getCreateComponents(), getContentComponents());
	}

	private Component getCreateComponents() {
		
		HorizontalLayout hl = new HorizontalLayout (departamento, add);
		hl.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
		
		return hl;
	}
	
private Component getContentComponents() {
		
		HorizontalLayout content = new HorizontalLayout (grid, form);
		content.setFlexGrow(3, grid);
		content.setFlexGrow(1, form);
		content.setClassName("content");
		
		return content;
	}
	
	private void configureGrid() {
		grid.addClassName("produto-grid");
		grid.setColumns("nome", "codigo", "quantidade");
		grid.getColumns().forEach(col -> col.setAutoWidth(true));
		grid.setSizeFull();
	}
	
	private void configureForm() {

		form = new FormularioRequisicaoForm(Collections.emptyList());
		form.setWidth("25em");
		form.setSizeFull();
		
	}

}

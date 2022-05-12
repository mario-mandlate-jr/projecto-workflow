package com.mario.workflow.com.mario.workflow.views;

import java.util.List;

import com.mario.workflow.com.mario.workflow.models.Produto;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.router.Route;

@Route("requisicao")
public class FormularioRequisicaoForm extends FormLayout {
	
	//ComboBox<String> area = new ComboBox<>("Departamento");
	ComboBox<Produto> produto = new ComboBox<>("Produto");
	ComboBox<String> unit = new ComboBox<>("Unidade");
	
	NumberField quantidade = new NumberField("Quantidade");

	Button add = new Button("Adicionar");
	Button delete = new Button("Apagar");
	Button cancel = new Button("Cancelar");
	
	public FormularioRequisicaoForm(List<Produto> produtos) {
		
		addClassName("formularioRequisicao-form");
		
		produto.setItems(produtos);
		produto.setItemLabelGenerator(Produto::getNome);
		
		
		add (produto, quantidade, unit, createButtonLayout());
		
	}
	
	private Component createButtonLayout() {
		add.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
		delete.addThemeVariants(ButtonVariant.LUMO_ERROR);
		cancel.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
		
		return new HorizontalLayout(add, delete, cancel);
	}

}

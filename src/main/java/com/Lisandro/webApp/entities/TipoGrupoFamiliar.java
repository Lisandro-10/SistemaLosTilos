/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Lisandro.webApp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author lisan
 */
@Entity
@Table(name = "TipoGrupoFamiliar")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TipoGrupoFamiliar {
    
    
    @Column
    private String nombreTipoFamiliar;
}

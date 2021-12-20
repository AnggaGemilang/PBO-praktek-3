/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanGenerics;

/**
 *
 * @author angga
 */

// Generic Interface

interface Standing<T> {
    <T> String standing(Team<?> team);
}

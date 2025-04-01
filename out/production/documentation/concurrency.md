# Java Concurrency

## Table of Contents
1. [Introduction](#introduction)
2. [Concurrency](#concurrency)
3. [Thread](#thread)
4. [Issues with Concurrency](#issues-with-concurrency)
5. [Synchronization](#synchronization)
6. [Reentrant Lock](#reentrant-lock)
7. [Atomic Variables](#atomic-variables)
8. [Concurrent HashMap](#concurrent-hashmap)
9. [Thread Pool](#thread-pool)
10. [Executor Service](#executor-service)

## Introduction

Concurrency is the ability of different parts or units of a program, algorithm, or problem to be executed out-of-order or in partial order, without affecting the final outcome. This allows for parallel execution of the code, which can result in significant performance improvements.

## Concurrency

Concurrency is the ability of a program to be broken into parts that can run independently of each other. This allows for multiple tasks to be executed simultaneously, which can result in significant performance improvements.

## Thread

A thread is the smallest unit of execution within a process. Threads share the same memory space and resources, but each thread has its own program counter, stack, and local variables. Threads can run concurrently, allowing for parallel execution of code.

## Issues with Concurrency

1. Deadlock: A deadlock occurs when two or more threads are waiting for each other to release a resource, resulting in a situation where none of the threads can proceed.
2. Livelock: A livelock occurs when two or more threads are actively trying to resolve a deadlock, but end up in a situation where none of the threads can proceed.
3. Starvation: Starvation occurs when a thread is unable to gain access to a resource it needs because other threads are continuously taking the resource

## Synchronization

Synchronization is the process of controlling the access of multiple threads to shared resources. This is done to prevent data corruption and ensure that the threads do not interfere with each other.

## Reentrant Lock

A reentrant lock is a synchronization primitive that allows a thread to acquire the lock multiple times. This is useful in situations where a thread needs to access a resource multiple times without releasing the lock.

## Atomic Variables

Atomic variables are variables that can be read and written to in a single operation. This ensures that the variable is always in a consistent state, even when accessed by multiple threads.

## Concurrent HashMap

A concurrent hash map is a thread-safe implementation of a hash map. This allows multiple threads to access the map concurrently without the need for external synchronization.

## Thread Pool

A thread pool is a collection of threads that can be reused to execute tasks. This allows for better performance and resource management, as threads can be reused instead of being created and destroyed for each task.

## Executor Service

An executor service is a higher-level abstraction for managing threads. It provides a simple interface for executing tasks and managing the thread pool. This allows for better control over the execution of tasks and the management of threads.






